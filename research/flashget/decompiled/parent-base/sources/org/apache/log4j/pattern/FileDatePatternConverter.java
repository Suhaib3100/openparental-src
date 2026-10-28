package org.apache.log4j.pattern;

/* loaded from: classes3.dex */
public final class FileDatePatternConverter {
    private FileDatePatternConverter() {
    }

    public static PatternConverter newInstance(String[] strArr) {
        return (strArr == null || strArr.length == 0) ? DatePatternConverter.newInstance(new String[]{"yyyy-MM-dd"}) : DatePatternConverter.newInstance(strArr);
    }
}
