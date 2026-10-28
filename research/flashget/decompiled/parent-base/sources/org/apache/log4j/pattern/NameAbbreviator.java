package org.apache.log4j.pattern;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class NameAbbreviator {
    private static final NameAbbreviator DEFAULT = new NOPAbbreviator();

    private static class DropElementAbbreviator extends NameAbbreviator {
        private final int count;

        public DropElementAbbreviator(int i4) {
            this.count = i4;
        }

        @Override // org.apache.log4j.pattern.NameAbbreviator
        public void abbreviate(int i4, StringBuffer stringBuffer) {
            int i5 = this.count;
            int indexOf = stringBuffer.indexOf(".", i4);
            while (indexOf != -1) {
                i5--;
                if (i5 == 0) {
                    stringBuffer.delete(i4, indexOf + 1);
                    return;
                }
                indexOf = stringBuffer.indexOf(".", indexOf + 1);
            }
        }
    }

    private static class MaxElementAbbreviator extends NameAbbreviator {
        private final int count;

        public MaxElementAbbreviator(int i4) {
            this.count = i4;
        }

        @Override // org.apache.log4j.pattern.NameAbbreviator
        public void abbreviate(int i4, StringBuffer stringBuffer) {
            int length = stringBuffer.length() - 1;
            String stringBuffer2 = stringBuffer.toString();
            for (int i5 = this.count; i5 > 0; i5--) {
                length = stringBuffer2.lastIndexOf(".", length - 1);
                if (length == -1 || length < i4) {
                    return;
                }
            }
            stringBuffer.delete(i4, length + 1);
        }
    }

    private static class NOPAbbreviator extends NameAbbreviator {
        @Override // org.apache.log4j.pattern.NameAbbreviator
        public void abbreviate(int i4, StringBuffer stringBuffer) {
        }
    }

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
        public void abbreviate(int i4, StringBuffer stringBuffer) {
            for (int i5 = 0; i5 < this.fragments.length - 1 && i4 < stringBuffer.length(); i5++) {
                i4 = this.fragments[i5].abbreviate(stringBuffer, i4);
            }
            PatternAbbreviatorFragment patternAbbreviatorFragment = this.fragments[r0.length - 1];
            while (i4 < stringBuffer.length() && i4 >= 0) {
                i4 = patternAbbreviatorFragment.abbreviate(stringBuffer, i4);
            }
        }
    }

    private static class PatternAbbreviatorFragment {
        private final int charCount;
        private final char ellipsis;

        public PatternAbbreviatorFragment(int i4, char c5) {
            this.charCount = i4;
            this.ellipsis = c5;
        }

        public int abbreviate(StringBuffer stringBuffer, int i4) {
            int indexOf = stringBuffer.toString().indexOf(".", i4);
            if (indexOf == -1) {
                return indexOf;
            }
            int i5 = indexOf - i4;
            int i6 = this.charCount;
            if (i5 > i6) {
                stringBuffer.delete(i6 + i4, indexOf);
                indexOf = this.charCount + i4;
                char c5 = this.ellipsis;
                if (c5 != 0) {
                    stringBuffer.insert(indexOf, c5);
                    indexOf++;
                }
            }
            return indexOf + 1;
        }
    }

    public static NameAbbreviator getAbbreviator(String str) {
        int i4;
        int i5;
        int i6;
        char c5;
        if (str.length() <= 0) {
            return DEFAULT;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return DEFAULT;
        }
        if (trim.length() > 0) {
            i4 = trim.charAt(0) == '-' ? 1 : 0;
            while (i4 < trim.length() && trim.charAt(i4) >= '0' && trim.charAt(i4) <= '9') {
                i4++;
            }
        } else {
            i4 = 0;
        }
        if (i4 == trim.length()) {
            int parseInt = Integer.parseInt(trim);
            return parseInt >= 0 ? new MaxElementAbbreviator(parseInt) : new DropElementAbbreviator(-parseInt);
        }
        ArrayList arrayList = new ArrayList(5);
        int i7 = 0;
        while (i7 < trim.length() && i7 >= 0) {
            if (trim.charAt(i7) == '*') {
                i6 = i7 + 1;
                i5 = Integer.MAX_VALUE;
            } else if (trim.charAt(i7) < '0' || trim.charAt(i7) > '9') {
                i5 = 0;
                i6 = i7;
            } else {
                i5 = trim.charAt(i7) - '0';
                i6 = i7 + 1;
            }
            if (i6 >= trim.length() || (c5 = trim.charAt(i6)) == '.') {
                c5 = 0;
            }
            arrayList.add(new PatternAbbreviatorFragment(i5, c5));
            int indexOf = trim.indexOf(".", i7);
            if (indexOf == -1) {
                break;
            }
            i7 = indexOf + 1;
        }
        return new PatternAbbreviator(arrayList);
    }

    public static NameAbbreviator getDefaultAbbreviator() {
        return DEFAULT;
    }

    public abstract void abbreviate(int i4, StringBuffer stringBuffer);
}
