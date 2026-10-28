package org.apache.log4j.pattern;

/* loaded from: classes5.dex */
public abstract class PatternConverter {
    private final String name;
    private final String style;

    protected PatternConverter(String str, String str2) {
        this.name = str;
        this.style = str2;
    }

    public abstract void format(Object obj, StringBuffer stringBuffer);

    public final String getName() {
        return this.name;
    }

    public String getStyleClass(Object obj) {
        return this.style;
    }
}
