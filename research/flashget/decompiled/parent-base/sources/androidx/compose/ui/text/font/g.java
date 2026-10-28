package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.i;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/b1;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "(Landroidx/compose/ui/text/font/b1;Landroid/content/Context;)Landroid/graphics/Typeface;", "d", "(Landroidx/compose/ui/text/font/b1;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n314#2,11:87\n*S KotlinDebug\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n*L\n72#1:87,11\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* compiled from: AndroidFontLoader.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/ui/text/font/g$a", "Landroidx/core/content/res/i$f;", "Landroid/graphics/Typeface;", "typeface", "Lkotlin/k2;", "i", "(Landroid/graphics/Typeface;)V", "", "reason", "h", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends i.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<Typeface> f20714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1 f20715b;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.p<? super Typeface> pVar, b1 b1Var) {
            this.f20714a = pVar;
            this.f20715b = b1Var;
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: h */
        public void f(int reason) {
            this.f20714a.f(new IllegalStateException("Unable to load font " + this.f20715b + " (reason=" + reason + ')'));
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: i */
        public void g(@fg.l Typeface typeface) {
            kotlinx.coroutines.p<Typeface> pVar = this.f20714a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(b1 b1Var, Context context) {
        Typeface j4 = androidx.core.content.res.i.j(context, b1Var.getResId());
        kotlin.jvm.internal.l0.m(j4);
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(b1 b1Var, Context context, kotlin.coroutines.d<? super Typeface> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        androidx.core.content.res.i.l(context, b1Var.getResId(), new a(qVar, b1Var), null);
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }
}
