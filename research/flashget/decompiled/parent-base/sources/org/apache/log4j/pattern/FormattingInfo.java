package org.apache.log4j.pattern;

/* loaded from: classes3.dex */
public final class FormattingInfo {
    private final boolean leftAlign;
    private final int maxLength;
    private final int minLength;
    private static final char[] SPACES = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    private static final FormattingInfo DEFAULT = new FormattingInfo(false, 0, Integer.MAX_VALUE);

    public FormattingInfo(boolean z4, int i4, int i5) {
        this.leftAlign = z4;
        this.minLength = i4;
        this.maxLength = i5;
    }

    public static FormattingInfo getDefault() {
        return DEFAULT;
    }

    public void format(int i4, StringBuffer stringBuffer) {
        int length = stringBuffer.length() - i4;
        if (length > this.maxLength) {
            stringBuffer.delete(i4, stringBuffer.length() - this.maxLength);
            return;
        }
        int i5 = this.minLength;
        if (length < i5) {
            if (this.leftAlign) {
                stringBuffer.setLength(i4 + this.minLength);
                for (int length2 = stringBuffer.length(); length2 < stringBuffer.length(); length2++) {
                    stringBuffer.setCharAt(length2, ' ');
                }
                return;
            }
            int i6 = i5 - length;
            while (i6 > 8) {
                stringBuffer.insert(i4, SPACES);
                i6 -= 8;
            }
            stringBuffer.insert(i4, SPACES, 0, i6);
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
