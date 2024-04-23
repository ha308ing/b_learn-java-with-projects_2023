package printSign;

public class PrintSign {
    private String[] messages;
    private int longestStringSize = 0;
    private int stickHeight = 0;
    private String signString = "";
    private final byte VERTICAL_PADDING = 2;
    private final byte HORIZONTAL_PADDING = 3;
    private final char SPACE_CHAR = '\u00A0';
    private final char BORDER_HORIZONTAL_CHAR = '\u2550';
    private final char BORDER_VERTICAL_CHAR = '\u2551';
    private final char CORNER_TOP_LEFT_CHAR = '\u2554';
    private final char CORNER_TOP_RIGHT_CHAR = '\u2557';
    private final char CORNER_BOTTOM_LEFT_CHAR = '\u255A';
    private final char CORNER_BOTTOM_RIGHT_CHAR = '\u255D';
    private final char STICK_CONNECTOR_CHAR = '\u2566';
    private final char STICK_CHAR = '\u2551';

    PrintSign(String[] messages) {
        this(messages, 0);
    }

    PrintSign(String[] messages, int stickHeight) {
        this.messages = messages;
        this.stickHeight = stickHeight < 0 ? 0 : stickHeight;
        generateSignString();
    }

    private void generateSignString() {
        calculateLongestMessageSize(messages);

        String verticalPadding = createEmptyRow().repeat(VERTICAL_PADDING);

        signString += createTopRow();
        signString += verticalPadding;

        for (String s : messages) {
            String messageRow = createContentRow(s);
            signString += messageRow;
        }

        signString += verticalPadding;

        if (stickHeight > 0) {
            signString += createBottomWithStickRow();
            signString += createStickRow().repeat(stickHeight);
        } else {
            signString += createBottomRow();
        }

    }

    private void calculateLongestMessageSize(String[] messages) {
        int size = 0;
        for (String s : messages) {
            if (s.length() > size) {
                size = s.length();
            }
        }
        longestStringSize = size + HORIZONTAL_PADDING * 2;
    }

    public String getSignString() {
        return signString;
    }

    /**
     * Create a row from the char, use the char as filler
     * 
     * @param left    leftmost char ( border/space ?) {@code char}
     * @param content a char to fill the row with {@code char}
     * @param right   rightmost char ( border/space ?) {@code char}
     * @return string for printing with {@code \n} at the end {@code String}
     */
    private String createRow(char left, char content, char right) {
        String contentString = String.valueOf(content);
        return createRow(left, contentString, right, content);
    }

    private String createRow(char left, char content, char right, char filler) {
        String contentString = String.valueOf(content);
        return createRow(left, contentString, right, filler);
    }

    /**
     * Create a row from the string, at center,
     * add paddings to match largest string of the messages (nbsp as filler)
     * 
     * @param left    leftmost char ( border/space ?) {@code char}
     * @param content string to place in center of the row {@code String}
     * @param right   rightmost char ( border/space ?) {@code char}
     * @return string for printing with {@code \n} at the end {@code String}
     */
    private String createRow(char left, String content, char right) {
        return createRow(left, content, right, SPACE_CHAR);
    }

    /**
     * General row creation function,
     * 
     * @param left    leftmost char ( border/space ?) {@code char}
     * @param content string to place in center of the row {@code String}
     * @param right   rightmost char ( border/space ?) {@code char}
     * @param filler  to fill space from border to the content {@code char}
     * @return string for printing with {@code \n} at the end {@code String}
     */
    private String createRow(char left, String content, char right, char filler) {
        String leftString = String.valueOf(left);
        String righString = String.valueOf(right);
        String fillerString = String.valueOf(filler);
        int spacingTotalSize = longestStringSize - content.length();
        int spacingLeftSize = spacingTotalSize % 2 == 0 ? spacingTotalSize / 2 : (spacingTotalSize - 1) / 2 + 1;
        if (spacingLeftSize < 0)
            spacingLeftSize = 0;

        int spacingRightSize = spacingTotalSize - spacingLeftSize;
        if (spacingRightSize < 0)
            spacingRightSize = 0;

        return leftString + fillerString.repeat(spacingLeftSize) + content + fillerString.repeat(spacingRightSize)
                + righString + "\n";
    }

    private String createTopRow() {
        return createRow(CORNER_TOP_LEFT_CHAR, BORDER_HORIZONTAL_CHAR, CORNER_TOP_RIGHT_CHAR);
    }

    private String createBottomRow() {
        return createRow(CORNER_BOTTOM_LEFT_CHAR, BORDER_HORIZONTAL_CHAR, CORNER_BOTTOM_RIGHT_CHAR);
    }

    private String createBottomWithStickRow() {
        return createRow(CORNER_BOTTOM_LEFT_CHAR, STICK_CONNECTOR_CHAR, CORNER_BOTTOM_RIGHT_CHAR,
                BORDER_HORIZONTAL_CHAR);
    }

    private String createContentRow(String content) {
        return createRow(BORDER_VERTICAL_CHAR, content, BORDER_VERTICAL_CHAR);
    }

    private String createEmptyRow() {
        return createRow(BORDER_VERTICAL_CHAR, SPACE_CHAR, BORDER_VERTICAL_CHAR);
    }

    private String createStickRow() {
        return createRow(SPACE_CHAR, STICK_CHAR, SPACE_CHAR, SPACE_CHAR);
    }

}
