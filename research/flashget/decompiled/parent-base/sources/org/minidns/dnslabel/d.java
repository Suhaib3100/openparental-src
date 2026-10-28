package org.minidns.dnslabel;

/* compiled from: LeadingOrTrailingHyphenLabel.java */
/* loaded from: classes4.dex */
public final class d extends e {
    protected d(String str) {
        super(str);
    }

    protected static boolean o(String str) {
        if (str.isEmpty()) {
            return false;
        }
        return str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-';
    }
}
