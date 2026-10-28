package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.b1;

/* compiled from: CsvTranslators.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char f86688a = ',';

    /* renamed from: b, reason: collision with root package name */
    private static final char f86689b = '\"';

    /* renamed from: c, reason: collision with root package name */
    private static final String f86690c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f86691d;

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f86692e;

    /* compiled from: CsvTranslators.java */
    public static class a extends k {
        @Override // org.apache.commons.text.translate.k, org.apache.commons.text.translate.b
        public /* bridge */ /* synthetic */ int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
            return super.b(charSequence, i4, writer);
        }

        @Override // org.apache.commons.text.translate.k
        void g(CharSequence charSequence, Writer writer) throws IOException {
            String charSequence2 = charSequence.toString();
            if (b1.A(charSequence2, d.f86692e)) {
                writer.write(charSequence2);
                return;
            }
            writer.write(34);
            writer.write(b1.b2(charSequence2, d.f86690c, d.f86691d));
            writer.write(34);
        }
    }

    /* compiled from: CsvTranslators.java */
    public static class b extends k {
        @Override // org.apache.commons.text.translate.k, org.apache.commons.text.translate.b
        public /* bridge */ /* synthetic */ int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
            return super.b(charSequence, i4, writer);
        }

        @Override // org.apache.commons.text.translate.k
        void g(CharSequence charSequence, Writer writer) throws IOException {
            if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
                writer.write(charSequence.toString());
                return;
            }
            String charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
            if (b1.w(charSequence2, d.f86692e)) {
                writer.write(b1.b2(charSequence2, d.f86691d, d.f86690c));
            } else {
                writer.write(charSequence2);
            }
        }
    }

    static {
        String valueOf = String.valueOf('\"');
        f86690c = valueOf;
        f86691d = androidx.compose.runtime.changelist.j.a(valueOf, valueOf);
        f86692e = new char[]{f86688a, '\"', org.apache.commons.lang3.m.f86065d, '\n'};
    }

    private d() {
    }
}
