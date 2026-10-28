package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.d;
import kotlin.Metadata;

/* compiled from: DeviceFontFamilyNameFont.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/s0;", "Landroidx/compose/ui/text/font/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/d;", "font", "Landroid/graphics/Typeface;", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/d;)Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Landroidx/compose/ui/text/font/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s0 implements d.a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final s0 f20871a = new s0();

    private s0() {
    }

    @Override // androidx.compose.ui.text.font.d.a
    @fg.m
    public Object a(@fg.l Context context, @fg.l d dVar, @fg.l kotlin.coroutines.d<? super Typeface> dVar2) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.ui.text.font.d.a
    @fg.m
    public Typeface b(@fg.l Context context, @fg.l d font) {
        u uVar = font instanceof u ? (u) font : null;
        if (uVar != null) {
            return uVar.f(context);
        }
        return null;
    }
}
