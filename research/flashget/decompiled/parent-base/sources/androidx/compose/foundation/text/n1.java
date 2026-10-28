package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: ValidatingOffsetMapping.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/input/k1;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/input/i1;", "a", "(Landroidx/compose/ui/text/input/k1;Landroidx/compose/ui/text/e;)Landroidx/compose/ui/text/input/i1;", "Landroidx/compose/ui/text/input/p0;", "Landroidx/compose/ui/text/input/p0;", "b", "()Landroidx/compose/ui/text/input/p0;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.text.input.p0 f7835a = new m1(androidx.compose.ui.text.input.p0.INSTANCE.a(), 0, 0);

    @fg.l
    public static final androidx.compose.ui.text.input.i1 a(@fg.l androidx.compose.ui.text.input.k1 k1Var, @fg.l androidx.compose.ui.text.e eVar) {
        androidx.compose.ui.text.input.i1 a5 = k1Var.a(eVar);
        return new androidx.compose.ui.text.input.i1(a5.getText(), new m1(a5.getOffsetMapping(), eVar.length(), a5.getText().length()));
    }

    @fg.l
    public static final androidx.compose.ui.text.input.p0 b() {
        return f7835a;
    }
}
