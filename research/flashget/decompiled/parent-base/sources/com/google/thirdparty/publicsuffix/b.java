package com.google.thirdparty.publicsuffix;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PublicSuffixType.java */
@d9.a
@d9.b
/* loaded from: classes6.dex */
public enum b {
    PRIVATE(':', ','),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    b(char c5, char c6) {
        this.innerNodeCode = c5;
        this.leafNodeCode = c6;
    }

    static b fromCode(char c5) {
        for (b bVar : values()) {
            if (bVar.getInnerNodeCode() == c5 || bVar.getLeafNodeCode() == c5) {
                return bVar;
            }
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append(ProtectedSandApp.s("࢛\u0001"));
        sb.append(c5);
        throw new IllegalArgumentException(sb.toString());
    }

    char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}
