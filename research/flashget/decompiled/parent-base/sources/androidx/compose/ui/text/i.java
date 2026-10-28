package androidx.compose.ui.text;

import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextLayoutResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/i;", "Landroidx/compose/ui/text/font/x$b;", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/font/y$b;)V", "Landroidx/compose/ui/text/font/x;", "font", "", "a", "(Landroidx/compose/ui/text/font/x;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/y$b;", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i implements x.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static Map<y.b, x.b> f20961c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.text.platform.z f20962d = new androidx.compose.ui.text.platform.z();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b fontFamilyResolver;

    /* compiled from: TextLayoutResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/i$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/x$b;", "a", "(Landroidx/compose/ui/text/font/y$b;)Landroidx/compose/ui/text/font/x$b;", "", "cache", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "d", "(Ljava/util/Map;)V", "Landroidx/compose/ui/text/platform/z;", "lock", "Landroidx/compose/ui/text/platform/z;", "c", "()Landroidx/compose/ui/text/platform/z;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,604:1\n26#2:605\n1#3:606\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n290#1:605\n*E\n"})
    /* renamed from: androidx.compose.ui.text.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final x.b a(@fg.l y.b fontFamilyResolver) {
            synchronized (i.f20962d) {
                Companion companion = i.INSTANCE;
                companion.getClass();
                x.b bVar = (x.b) i.f20961c.get(fontFamilyResolver);
                if (bVar != null) {
                    return bVar;
                }
                i iVar = new i(fontFamilyResolver, null);
                companion.getClass();
                i.f20961c.put(fontFamilyResolver, iVar);
                return iVar;
            }
        }

        @fg.l
        public final Map<y.b, x.b> b() {
            return i.f20961c;
        }

        @fg.l
        public final androidx.compose.ui.text.platform.z c() {
            return i.f20962d;
        }

        public final void d(@fg.l Map<y.b, x.b> map) {
            i.f20961c = map;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ i(y.b bVar, kotlin.jvm.internal.w wVar) {
        this(bVar);
    }

    @Override // androidx.compose.ui.text.font.x.b
    @fg.l
    @kotlin.k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.x0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public Object a(@fg.l androidx.compose.ui.text.font.x font) {
        return y.b.c(this.fontFamilyResolver, androidx.compose.ui.text.font.e0.g(font), font.getWeight(), font.getStyle(), 0, 8, null).getValue();
    }

    private i(y.b bVar) {
        this.fontFamilyResolver = bVar;
    }
}
