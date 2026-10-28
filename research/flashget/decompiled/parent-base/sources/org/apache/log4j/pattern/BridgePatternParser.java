package org.apache.log4j.pattern;

/* loaded from: classes3.dex */
public final class BridgePatternParser extends org.apache.log4j.helpers.PatternParser {
    public BridgePatternParser(String str) {
        super(str);
    }

    @Override // org.apache.log4j.helpers.PatternParser
    public org.apache.log4j.helpers.PatternConverter parse() {
        return new BridgePatternConverter(this.pattern);
    }
}
