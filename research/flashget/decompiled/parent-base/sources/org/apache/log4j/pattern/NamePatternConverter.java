package org.apache.log4j.pattern;

/* loaded from: classes3.dex */
public abstract class NamePatternConverter extends LoggingEventPatternConverter {
    private final NameAbbreviator abbreviator;

    protected NamePatternConverter(String str, String str2, String[] strArr) {
        super(str, str2);
        if (strArr == null || strArr.length <= 0) {
            this.abbreviator = NameAbbreviator.getDefaultAbbreviator();
        } else {
            this.abbreviator = NameAbbreviator.getAbbreviator(strArr[0]);
        }
    }

    protected final void abbreviate(int i4, StringBuffer stringBuffer) {
        this.abbreviator.abbreviate(i4, stringBuffer);
    }
}
