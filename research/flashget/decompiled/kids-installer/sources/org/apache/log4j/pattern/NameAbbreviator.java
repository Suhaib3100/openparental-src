package org.apache.log4j.pattern;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class NameAbbreviator {
    private static final NameAbbreviator DEFAULT = new NOPAbbreviator();

    /* loaded from: classes6.dex */
    private static class DropElementAbbreviator extends NameAbbreviator {
        private final int count;

        public DropElementAbbreviator(int i5) {
            this.count = i5;
        }

        @Override // org.apache.log4j.pattern.NameAbbreviator
        public void abbreviate(int i5, StringBuffer stringBuffer) {
            int i6 = this.count;
            int indexOf = stringBuffer.indexOf(".", i5);
            while (indexOf != -1) {
                i6--;
                if (i6 == 0) {
                    stringBuffer.delete(i5, indexOf + 1);
                    return;
                }
                indexOf = stringBuffer.indexOf(".", indexOf + 1);
            }
        }
    }

    /* loaded from: classes6.dex */
    private static class MaxElementAbbreviator extends NameAbbreviator {
        private final int count;

        public MaxElementAbbreviator(int i5) {
            this.count = i5;
        }

        @Override // org.apache.log4j.pattern.NameAbbreviator
        public void abbreviate(int i5, StringBuffer stringBuffer) {
            int length = stringBuffer.length() - 1;
            String stringBuffer2 = stringBuffer.toString();
            for (int i6 = this.count; i6 > 0; i6--) {
                length = stringBuffer2.lastIndexOf(".", length - 1);
                if (length == -1 || length < i5) {
                    return;
                }
            }
            stringBuffer.delete(i5, length + 1);
        }
    }

    /* loaded from: classes6.dex */
    private static class NOPAbbreviator extends NameAbbreviator {
        @Override // org.apache.log4j.pattern.NameAbbreviator
        public void abbreviate(int i5, StringBuffer stringBuffer) {
        }
    }

    /* loaded from: classes6.dex */
    private static class PatternAbbreviator extends NameAbbreviator {
        private final PatternAbbreviatorFragment[] fragments;

        public PatternAbbreviator(List list) {
            if (list.size() == 0) {
                throw new IllegalArgumentException("fragments must have at least one element");
            }
            PatternAbbreviatorFragment[] patternAbbreviatorFragmentArr = new PatternAbbreviatorFragment[list.size()];
            this.fragments = patternAbbreviatorFragmentArr;
            list.toArray(patternAbbreviatorFragmentArr);
        }

        @Override // org.apache.log4j.pattern.NameAbbreviator
        public void abbreviate(int i5, StringBuffer stringBuffer) {
            for (int i6 = 0; i6 < this.fragments.length - 1 && i5 < stringBuffer.length(); i6++) {
                i5 = this.fragments[i6].abbreviate(stringBuffer, i5);
            }
            PatternAbbreviatorFragment patternAbbreviatorFragment = this.fragments[r0.length - 1];
            while (i5 < stringBuffer.length() && i5 >= 0) {
                i5 = patternAbbreviatorFragment.abbreviate(stringBuffer, i5);
            }
        }
    }

    private static class PatternAbbreviatorFragment {
        private final int charCount;
        private final char ellipsis;

        public PatternAbbreviatorFragment(int i5, char c6) {
            this.charCount = i5;
            this.ellipsis = c6;
        }

        public int abbreviate(StringBuffer stringBuffer, int i5) {
            int indexOf = stringBuffer.toString().indexOf(".", i5);
            if (indexOf == -1) {
                return indexOf;
            }
            int i6 = indexOf - i5;
            int i7 = this.charCount;
            if (i6 > i7) {
                stringBuffer.delete(i7 + i5, indexOf);
                indexOf = this.charCount + i5;
                char c6 = this.ellipsis;
                if (c6 != 0) {
                    stringBuffer.insert(indexOf, c6);
                    indexOf++;
                }
            }
            return indexOf + 1;
        }
    }

    public static NameAbbreviator getAbbreviator(String str) {
        int i5;
        int i6;
        int i7;
        char c6;
        if (str.length() <= 0) {
            return DEFAULT;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return DEFAULT;
        }
        if (trim.length() > 0) {
            i5 = trim.charAt(0) == '-' ? 1 : 0;
            while (i5 < trim.length() && trim.charAt(i5) >= '0' && trim.charAt(i5) <= '9') {
                i5++;
            }
        } else {
            i5 = 0;
        }
        if (i5 == trim.length()) {
            int parseInt = Integer.parseInt(trim);
            return parseInt >= 0 ? new MaxElementAbbreviator(parseInt) : new DropElementAbbreviator(-parseInt);
        }
        ArrayList arrayList = new ArrayList(5);
        int i8 = 0;
        while (i8 < trim.length() && i8 >= 0) {
            if (trim.charAt(i8) == '*') {
                i7 = i8 + 1;
                i6 = Integer.MAX_VALUE;
            } else if (trim.charAt(i8) < '0' || trim.charAt(i8) > '9') {
                i6 = 0;
                i7 = i8;
            } else {
                i6 = trim.charAt(i8) - '0';
                i7 = i8 + 1;
            }
            if (i7 >= trim.length() || (c6 = trim.charAt(i7)) == '.') {
                c6 = 0;
            }
            arrayList.add(new PatternAbbreviatorFragment(i6, c6));
            int indexOf = trim.indexOf(".", i8);
            if (indexOf == -1) {
                break;
            }
            i8 = indexOf + 1;
        }
        return new PatternAbbreviator(arrayList);
    }

    public static NameAbbreviator getDefaultAbbreviator() {
        return DEFAULT;
    }

    public abstract void abbreviate(int i5, StringBuffer stringBuffer);
}
