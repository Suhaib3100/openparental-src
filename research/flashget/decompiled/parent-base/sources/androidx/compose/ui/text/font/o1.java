package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/o1;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/n0$e;", "Landroid/content/Context;", "context", "", "b", "(Landroidx/compose/ui/text/font/n0$e;Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "a", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/n0$e;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
/* loaded from: classes.dex */
final class o1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final o1 f20842a = new o1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    /* compiled from: PlatformTypefaces.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/n0$a;", "setting", "", "a", "(Landroidx/compose/ui/text/font/n0$a;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<n0.a, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f20844b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.unit.d dVar) {
            super(1);
            this.f20844b = dVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l n0.a aVar) {
            return "'" + aVar.getAxisName() + "' " + aVar.b(this.f20844b);
        }
    }

    private o1() {
    }

    @androidx.compose.ui.text.k
    private final String b(n0.e eVar, Context context) {
        return androidx.compose.ui.util.c.q(eVar.b(), null, null, null, 0, null, new a(androidx.compose.ui.unit.a.a(context)), 31, null);
    }

    @fg.m
    @androidx.compose.ui.text.k
    public final Typeface a(@fg.m Typeface typeface, @fg.l n0.e variationSettings, @fg.l Context context) {
        if (typeface == null) {
            return null;
        }
        if (variationSettings.b().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(variationSettings, context));
        return paint.getTypeface();
    }
}
