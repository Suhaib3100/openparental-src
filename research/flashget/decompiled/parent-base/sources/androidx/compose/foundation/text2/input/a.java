package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.f0;
import androidx.compose.foundation.text2.input.o;
import androidx.compose.ui.text.k0;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AllCapsTransformation.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text2/input/a;", "Landroidx/compose/foundation/text2/input/h;", "Lu0/e;", "locale", "<init>", "(Lu0/e;)V", "c", "()Lu0/e;", "Landroidx/compose/foundation/text2/input/q;", "originalValue", "Landroidx/compose/foundation/text2/input/o;", "valueWithChanges", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o;)V", "", "toString", "()Ljava/lang/String;", "d", "(Lu0/e;)Landroidx/compose/foundation/text2/input/a;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lu0/e;", "Landroidx/compose/foundation/text/f0;", "Landroidx/compose/foundation/text/f0;", "()Landroidx/compose/foundation/text/f0;", "keyboardOptions", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAllCapsTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBufferKt\n*L\n1#1,64:1\n545#2,7:65\n*S KotlinDebug\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n*L\n51#1:65,7\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class a implements h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u0.e locale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f0 keyboardOptions;

    public a(@fg.l u0.e eVar) {
        this.locale = eVar;
        androidx.compose.ui.text.input.f0.INSTANCE.getClass();
        this.keyboardOptions = new f0(androidx.compose.ui.text.input.f0.f21019d, false, 0, 0, null, 30, null);
    }

    /* renamed from: c, reason: from getter */
    private final u0.e getLocale() {
        return this.locale;
    }

    public static a e(a aVar, u0.e eVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            eVar = aVar.locale;
        }
        aVar.getClass();
        return new a(eVar);
    }

    @Override // androidx.compose.foundation.text2.input.h
    public void a(@fg.l q originalValue, @fg.l o valueWithChanges) {
        o.a h4 = valueWithChanges.h();
        for (int i4 = 0; i4 < h4.a(); i4++) {
            long c5 = h4.c(i4);
            h4.b(i4);
            if (!t0.h(c5)) {
                valueWithChanges.s(t0.l(c5), t0.k(c5), k0.g(u0.e(valueWithChanges.a(), c5), this.locale));
            }
        }
    }

    @Override // androidx.compose.foundation.text2.input.h
    @fg.l
    /* renamed from: b, reason: from getter */
    public f0 getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @fg.l
    public final a d(@fg.l u0.e locale) {
        return new a(locale);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a) && l0.g(this.locale, ((a) other).locale);
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    @fg.l
    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.locale + ')';
    }
}
