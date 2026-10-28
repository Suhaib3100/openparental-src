package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: Font.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00068&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/x;", "", "Landroidx/compose/ui/text/font/o0;", "a", "()Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "c", "()I", "style", "Landroidx/compose/ui/text/font/i0;", "b", "loadingStrategy", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f20889a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f20888b = 15000;

    /* compiled from: Font.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/x$a;", "", "<init>", "()V", "", "b", "J", "MaximumAsyncTimeoutMillis", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.x$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f20889a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    /* compiled from: Font.kt */
    @kotlin.k(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/x$b;", "", "Landroidx/compose/ui/text/font/x;", "font", "a", "(Landroidx/compose/ui/text/font/x;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        @fg.l
        @kotlin.k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.x0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        Object a(@fg.l x font);
    }

    @fg.l
    o0 a();

    default int b() {
        i0.INSTANCE.getClass();
        return i0.f20743c;
    }

    int c();
}
