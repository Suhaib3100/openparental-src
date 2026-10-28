package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.g1;
import androidx.compose.ui.text.font.b1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidFontListTypeface.android.kt */
@kotlin.k(message = "Duplicate cache")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/platform/p;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/x;", "font", "Landroid/graphics/Typeface;", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/x;)Landroid/graphics/Typeface;", "", "a", "(Landroid/content/Context;Landroidx/compose/ui/text/font/x;)Ljava/lang/String;", "Landroidx/collection/g1;", "Landroidx/collection/g1;", "cache", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final p f21269a = new p();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final g1<String, Typeface> cache = new g1<>(16);

    /* renamed from: c, reason: collision with root package name */
    public static final int f21271c = 8;

    private p() {
    }

    @fg.m
    public final String a(@fg.l Context context, @fg.l androidx.compose.ui.text.font.x font) {
        if (!(font instanceof b1)) {
            if (font instanceof androidx.compose.ui.text.font.k) {
                return ((androidx.compose.ui.text.font.k) font).g();
            }
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((b1) font).getResId(), typedValue, true);
        StringBuilder sb = new StringBuilder("res:");
        CharSequence charSequence = typedValue.string;
        String obj = charSequence != null ? charSequence.toString() : null;
        l0.m(obj);
        sb.append(obj);
        return sb.toString();
    }

    @fg.l
    public final Typeface b(@fg.l Context context, @fg.l androidx.compose.ui.text.font.x font) {
        Typeface b5;
        Typeface typeface;
        String a5 = a(context, font);
        if (a5 != null && (typeface = cache.get(a5)) != null) {
            return typeface;
        }
        if (font instanceof b1) {
            if (Build.VERSION.SDK_INT >= 26) {
                b5 = j.f21262a.a(context, ((b1) font).getResId());
            } else {
                b5 = androidx.core.content.res.i.j(context, ((b1) font).getResId());
                l0.m(b5);
            }
        } else {
            if (!(font instanceof androidx.compose.ui.text.font.d)) {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            androidx.compose.ui.text.font.d dVar = (androidx.compose.ui.text.font.d) font;
            b5 = dVar.getTypefaceLoader().b(context, dVar);
        }
        if (b5 != null) {
            if (a5 != null) {
                cache.put(a5, b5);
            }
            return b5;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
