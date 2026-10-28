package org.apache.log4j.pattern;

/* loaded from: classes5.dex */
public final class FormattingInfo {
    private final boolean leftAlign;
    private final int maxLength;
    private final int minLength;
    private static final char[] SPACES = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    private static final FormattingInfo DEFAULT = new FormattingInfo(false, 0, Integer.MAX_VALUE);

    public FormattingInfo(boolean z5, int i5, int i6) {
        this.leftAlign = z5;
        this.minLength = i5;
        this.maxLength = i6;
    }

    public static FormattingInfo getDefault() {
        return DEFAULT;
    }

    public void format(int i5, StringBuffer stringBuffer) {
        int length = stringBuffer.length() - i5;
        if (length > this.maxLength) {
            stringBuffer.delete(i5, stringBuffer.length() - this.maxLength);
            return;
        }
        int i6 = this.minLength;
        if (length < i6) {
            if (this.leftAlign) {
                stringBuffer.setLength(i5 + this.minLength);
                for (int length2 = stringBuffer.length(); length2 < stringBuffer.length(); length2++) {
                    stringBuffer.setCharAt(length2, ' ');
                }
                return;
            }
            int i7 = i6 - length;
            while (i7 > 8) {
                stringBuffer.insert(i5, SPACES);
                i7 -= 8;
            }
            stringBuffer.insert(i5, SPACES, 0, i7);
        }
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public int getMinLength() {
        return this.minLength;
    }

    public boolean isLeftAligned() {
        return this.leftAlign;
    }
}
