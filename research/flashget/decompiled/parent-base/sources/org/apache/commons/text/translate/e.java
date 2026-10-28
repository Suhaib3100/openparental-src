package org.apache.commons.text.translate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EntityArrays.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86693a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86694b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86695c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86696d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86697e;

    /* renamed from: f, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86698f;

    /* renamed from: g, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86699g;

    /* renamed from: h, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86700h;

    /* renamed from: i, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86701i;

    /* renamed from: j, reason: collision with root package name */
    public static final Map<CharSequence, CharSequence> f86702j;

    static {
        HashMap a5 = com.coremedia.iso.boxes.d.a(" ", "&nbsp;", "¡", "&iexcl;");
        a5.put("¢", "&cent;");
        a5.put("£", "&pound;");
        a5.put("¤", "&curren;");
        a5.put("¥", "&yen;");
        a5.put("¦", "&brvbar;");
        a5.put("§", "&sect;");
        a5.put("¨", "&uml;");
        a5.put("©", "&copy;");
        a5.put("ª", "&ordf;");
        a5.put("«", "&laquo;");
        a5.put("¬", "&not;");
        a5.put("\u00ad", "&shy;");
        a5.put("®", "&reg;");
        a5.put("¯", "&macr;");
        a5.put("°", "&deg;");
        a5.put("±", "&plusmn;");
        a5.put("²", "&sup2;");
        a5.put("³", "&sup3;");
        a5.put("´", "&acute;");
        a5.put("µ", "&micro;");
        a5.put("¶", "&para;");
        a5.put("·", "&middot;");
        a5.put("¸", "&cedil;");
        a5.put("¹", "&sup1;");
        a5.put("º", "&ordm;");
        a5.put("»", "&raquo;");
        a5.put("¼", "&frac14;");
        a5.put("½", "&frac12;");
        a5.put("¾", "&frac34;");
        a5.put("¿", "&iquest;");
        a5.put("À", "&Agrave;");
        a5.put("Á", "&Aacute;");
        a5.put("Â", "&Acirc;");
        a5.put("Ã", "&Atilde;");
        a5.put("Ä", "&Auml;");
        a5.put("Å", "&Aring;");
        a5.put("Æ", "&AElig;");
        a5.put("Ç", "&Ccedil;");
        a5.put("È", "&Egrave;");
        a5.put("É", "&Eacute;");
        a5.put("Ê", "&Ecirc;");
        a5.put("Ë", "&Euml;");
        a5.put("Ì", "&Igrave;");
        a5.put("Í", "&Iacute;");
        a5.put("Î", "&Icirc;");
        a5.put("Ï", "&Iuml;");
        a5.put("Ð", "&ETH;");
        a5.put("Ñ", "&Ntilde;");
        a5.put("Ò", "&Ograve;");
        a5.put("Ó", "&Oacute;");
        a5.put("Ô", "&Ocirc;");
        a5.put("Õ", "&Otilde;");
        a5.put("Ö", "&Ouml;");
        a5.put("×", "&times;");
        a5.put("Ø", "&Oslash;");
        a5.put("Ù", "&Ugrave;");
        a5.put("Ú", "&Uacute;");
        a5.put("Û", "&Ucirc;");
        a5.put("Ü", "&Uuml;");
        a5.put("Ý", "&Yacute;");
        a5.put("Þ", "&THORN;");
        a5.put("ß", "&szlig;");
        a5.put("à", "&agrave;");
        a5.put("á", "&aacute;");
        a5.put("â", "&acirc;");
        a5.put("ã", "&atilde;");
        a5.put("ä", "&auml;");
        a5.put("å", "&aring;");
        a5.put("æ", "&aelig;");
        a5.put("ç", "&ccedil;");
        a5.put("è", "&egrave;");
        a5.put("é", "&eacute;");
        a5.put("ê", "&ecirc;");
        a5.put("ë", "&euml;");
        a5.put("ì", "&igrave;");
        a5.put("í", "&iacute;");
        a5.put("î", "&icirc;");
        a5.put("ï", "&iuml;");
        a5.put("ð", "&eth;");
        a5.put("ñ", "&ntilde;");
        a5.put("ò", "&ograve;");
        a5.put("ó", "&oacute;");
        a5.put("ô", "&ocirc;");
        a5.put("õ", "&otilde;");
        a5.put("ö", "&ouml;");
        a5.put("÷", "&divide;");
        a5.put("ø", "&oslash;");
        a5.put("ù", "&ugrave;");
        a5.put("ú", "&uacute;");
        a5.put("û", "&ucirc;");
        a5.put("ü", "&uuml;");
        a5.put("ý", "&yacute;");
        a5.put("þ", "&thorn;");
        a5.put("ÿ", "&yuml;");
        Map<CharSequence, CharSequence> unmodifiableMap = Collections.unmodifiableMap(a5);
        f86693a = unmodifiableMap;
        f86694b = Collections.unmodifiableMap(a(unmodifiableMap));
        HashMap a6 = com.coremedia.iso.boxes.d.a("ƒ", "&fnof;", "Α", "&Alpha;");
        a6.put("Β", "&Beta;");
        a6.put("Γ", "&Gamma;");
        a6.put("Δ", "&Delta;");
        a6.put("Ε", "&Epsilon;");
        a6.put("Ζ", "&Zeta;");
        a6.put("Η", "&Eta;");
        a6.put("Θ", "&Theta;");
        a6.put("Ι", "&Iota;");
        a6.put("Κ", "&Kappa;");
        a6.put("Λ", "&Lambda;");
        a6.put("Μ", "&Mu;");
        a6.put("Ν", "&Nu;");
        a6.put("Ξ", "&Xi;");
        a6.put("Ο", "&Omicron;");
        a6.put("Π", "&Pi;");
        a6.put("Ρ", "&Rho;");
        a6.put("Σ", "&Sigma;");
        a6.put("Τ", "&Tau;");
        a6.put("Υ", "&Upsilon;");
        a6.put("Φ", "&Phi;");
        a6.put("Χ", "&Chi;");
        a6.put("Ψ", "&Psi;");
        a6.put("Ω", "&Omega;");
        a6.put("α", "&alpha;");
        a6.put("β", "&beta;");
        a6.put("γ", "&gamma;");
        a6.put("δ", "&delta;");
        a6.put("ε", "&epsilon;");
        a6.put("ζ", "&zeta;");
        a6.put("η", "&eta;");
        a6.put("θ", "&theta;");
        a6.put("ι", "&iota;");
        a6.put("κ", "&kappa;");
        a6.put("λ", "&lambda;");
        a6.put("μ", "&mu;");
        a6.put("ν", "&nu;");
        a6.put("ξ", "&xi;");
        a6.put("ο", "&omicron;");
        a6.put("π", "&pi;");
        a6.put("ρ", "&rho;");
        a6.put("ς", "&sigmaf;");
        a6.put("σ", "&sigma;");
        a6.put("τ", "&tau;");
        a6.put("υ", "&upsilon;");
        a6.put("φ", "&phi;");
        a6.put("χ", "&chi;");
        a6.put("ψ", "&psi;");
        a6.put("ω", "&omega;");
        a6.put("ϑ", "&thetasym;");
        a6.put("ϒ", "&upsih;");
        a6.put("ϖ", "&piv;");
        a6.put("•", "&bull;");
        a6.put("…", "&hellip;");
        a6.put("′", "&prime;");
        a6.put("″", "&Prime;");
        a6.put("‾", "&oline;");
        a6.put("⁄", "&frasl;");
        a6.put("℘", "&weierp;");
        a6.put("ℑ", "&image;");
        a6.put("ℜ", "&real;");
        a6.put("™", "&trade;");
        a6.put("ℵ", "&alefsym;");
        a6.put("←", "&larr;");
        a6.put("↑", "&uarr;");
        a6.put("→", "&rarr;");
        a6.put("↓", "&darr;");
        a6.put("↔", "&harr;");
        a6.put("↵", "&crarr;");
        a6.put("⇐", "&lArr;");
        a6.put("⇑", "&uArr;");
        a6.put("⇒", "&rArr;");
        a6.put("⇓", "&dArr;");
        a6.put("⇔", "&hArr;");
        a6.put("∀", "&forall;");
        a6.put("∂", "&part;");
        a6.put("∃", "&exist;");
        a6.put("∅", "&empty;");
        a6.put("∇", "&nabla;");
        a6.put("∈", "&isin;");
        a6.put("∉", "&notin;");
        a6.put("∋", "&ni;");
        a6.put("∏", "&prod;");
        a6.put("∑", "&sum;");
        a6.put("−", "&minus;");
        a6.put("∗", "&lowast;");
        a6.put("√", "&radic;");
        a6.put("∝", "&prop;");
        a6.put("∞", "&infin;");
        a6.put("∠", "&ang;");
        a6.put("∧", "&and;");
        a6.put("∨", "&or;");
        a6.put("∩", "&cap;");
        a6.put("∪", "&cup;");
        a6.put("∫", "&int;");
        a6.put("∴", "&there4;");
        a6.put("∼", "&sim;");
        a6.put("≅", "&cong;");
        a6.put("≈", "&asymp;");
        a6.put("≠", "&ne;");
        a6.put("≡", "&equiv;");
        a6.put("≤", "&le;");
        a6.put("≥", "&ge;");
        a6.put("⊂", "&sub;");
        a6.put("⊃", "&sup;");
        a6.put("⊄", "&nsub;");
        a6.put("⊆", "&sube;");
        a6.put("⊇", "&supe;");
        a6.put("⊕", "&oplus;");
        a6.put("⊗", "&otimes;");
        a6.put("⊥", "&perp;");
        a6.put("⋅", "&sdot;");
        a6.put("⌈", "&lceil;");
        a6.put("⌉", "&rceil;");
        a6.put("⌊", "&lfloor;");
        a6.put("⌋", "&rfloor;");
        a6.put("〈", "&lang;");
        a6.put("〉", "&rang;");
        a6.put("◊", "&loz;");
        a6.put("♠", "&spades;");
        a6.put("♣", "&clubs;");
        a6.put("♥", "&hearts;");
        a6.put("♦", "&diams;");
        a6.put("Œ", "&OElig;");
        a6.put("œ", "&oelig;");
        a6.put("Š", "&Scaron;");
        a6.put("š", "&scaron;");
        a6.put("Ÿ", "&Yuml;");
        a6.put("ˆ", "&circ;");
        a6.put("˜", "&tilde;");
        a6.put("\u2002", "&ensp;");
        a6.put("\u2003", "&emsp;");
        a6.put("\u2009", "&thinsp;");
        a6.put("\u200c", "&zwnj;");
        a6.put("\u200d", "&zwj;");
        a6.put("\u200e", "&lrm;");
        a6.put("\u200f", "&rlm;");
        a6.put("–", "&ndash;");
        a6.put("—", "&mdash;");
        a6.put("‘", "&lsquo;");
        a6.put("’", "&rsquo;");
        a6.put("‚", "&sbquo;");
        a6.put("“", "&ldquo;");
        a6.put("”", "&rdquo;");
        a6.put("„", "&bdquo;");
        a6.put("†", "&dagger;");
        a6.put("‡", "&Dagger;");
        a6.put("‰", "&permil;");
        a6.put("‹", "&lsaquo;");
        a6.put("›", "&rsaquo;");
        a6.put("€", "&euro;");
        Map<CharSequence, CharSequence> unmodifiableMap2 = Collections.unmodifiableMap(a6);
        f86695c = unmodifiableMap2;
        f86696d = Collections.unmodifiableMap(a(unmodifiableMap2));
        HashMap a7 = com.coremedia.iso.boxes.d.a("\"", "&quot;", "&", "&amp;");
        a7.put("<", "&lt;");
        a7.put(">", "&gt;");
        Map<CharSequence, CharSequence> unmodifiableMap3 = Collections.unmodifiableMap(a7);
        f86697e = unmodifiableMap3;
        f86698f = Collections.unmodifiableMap(a(unmodifiableMap3));
        HashMap hashMap = new HashMap();
        hashMap.put("'", "&apos;");
        Map<CharSequence, CharSequence> unmodifiableMap4 = Collections.unmodifiableMap(hashMap);
        f86699g = unmodifiableMap4;
        f86700h = Collections.unmodifiableMap(a(unmodifiableMap4));
        HashMap a8 = com.coremedia.iso.boxes.d.a("\b", "\\b", "\n", "\\n");
        a8.put("\t", "\\t");
        a8.put("\f", "\\f");
        a8.put("\r", "\\r");
        Map<CharSequence, CharSequence> unmodifiableMap5 = Collections.unmodifiableMap(a8);
        f86701i = unmodifiableMap5;
        f86702j = Collections.unmodifiableMap(a(unmodifiableMap5));
    }

    public static Map<CharSequence, CharSequence> a(Map<CharSequence, CharSequence> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        return hashMap;
    }
}
