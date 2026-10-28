package org.apache.commons.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharacterPredicates.java */
/* loaded from: classes3.dex */
public abstract class e implements org.apache.commons.text.d {
    private static final /* synthetic */ e[] $VALUES;
    public static final e ARABIC_NUMERALS;
    public static final e ASCII_ALPHA_NUMERALS;
    public static final e ASCII_LETTERS;
    public static final e ASCII_LOWERCASE_LETTERS;
    public static final e ASCII_UPPERCASE_LETTERS;
    public static final e DIGITS;
    public static final e LETTERS;

    /* compiled from: CharacterPredicates.java */
    enum a extends e {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // org.apache.commons.text.d
        public boolean test(int i4) {
            return Character.isLetter(i4);
        }
    }

    static {
        a aVar = new a("LETTERS", 0);
        LETTERS = aVar;
        e eVar = new e("DIGITS", 1) { // from class: org.apache.commons.text.e.b
            {
                a aVar2 = null;
            }

            @Override // org.apache.commons.text.d
            public boolean test(int i4) {
                return Character.isDigit(i4);
            }
        };
        DIGITS = eVar;
        e eVar2 = new e("ARABIC_NUMERALS", 2) { // from class: org.apache.commons.text.e.c
            {
                a aVar2 = null;
            }

            @Override // org.apache.commons.text.d
            public boolean test(int i4) {
                return i4 >= 48 && i4 <= 57;
            }
        };
        ARABIC_NUMERALS = eVar2;
        e eVar3 = new e("ASCII_LOWERCASE_LETTERS", 3) { // from class: org.apache.commons.text.e.d
            {
                a aVar2 = null;
            }

            @Override // org.apache.commons.text.d
            public boolean test(int i4) {
                return i4 >= 97 && i4 <= 122;
            }
        };
        ASCII_LOWERCASE_LETTERS = eVar3;
        e eVar4 = new e("ASCII_UPPERCASE_LETTERS", 4) { // from class: org.apache.commons.text.e.e
            {
                a aVar2 = null;
            }

            @Override // org.apache.commons.text.d
            public boolean test(int i4) {
                return i4 >= 65 && i4 <= 90;
            }
        };
        ASCII_UPPERCASE_LETTERS = eVar4;
        e eVar5 = new e("ASCII_LETTERS", 5) { // from class: org.apache.commons.text.e.f
            {
                a aVar2 = null;
            }

            @Override // org.apache.commons.text.d
            public boolean test(int i4) {
                return e.ASCII_LOWERCASE_LETTERS.test(i4) || e.ASCII_UPPERCASE_LETTERS.test(i4);
            }
        };
        ASCII_LETTERS = eVar5;
        e eVar6 = new e("ASCII_ALPHA_NUMERALS", 6) { // from class: org.apache.commons.text.e.g
            {
                a aVar2 = null;
            }

            @Override // org.apache.commons.text.d
            public boolean test(int i4) {
                return e.ASCII_LOWERCASE_LETTERS.test(i4) || e.ASCII_UPPERCASE_LETTERS.test(i4) || e.ARABIC_NUMERALS.test(i4);
            }
        };
        ASCII_ALPHA_NUMERALS = eVar6;
        $VALUES = new e[]{aVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
    }

    private e(String str, int i4) {
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    /* synthetic */ e(String str, int i4, a aVar) {
        this(str, i4);
    }
}
