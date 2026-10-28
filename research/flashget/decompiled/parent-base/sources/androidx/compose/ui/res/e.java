package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: VectorResources.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0011\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/res/e;", "", "<init>", "()V", "Landroidx/compose/ui/res/e$b;", "key", "Landroidx/compose/ui/res/e$a;", "b", "(Landroidx/compose/ui/res/e$b;)Landroidx/compose/ui/res/e$a;", "", "configChanges", "Lkotlin/k2;", "c", "(I)V", "imageVectorEntry", "d", "(Landroidx/compose/ui/res/e$b;Landroidx/compose/ui/res/e$a;)V", "a", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20262b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final HashMap<b, WeakReference<a>> map = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    @u(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/res/e$a;", "", "Landroidx/compose/ui/graphics/vector/d;", "imageVector", "", "configFlags", "<init>", "(Landroidx/compose/ui/graphics/vector/d;I)V", "a", "()Landroidx/compose/ui/graphics/vector/d;", "b", "()I", "c", "(Landroidx/compose/ui/graphics/vector/d;I)Landroidx/compose/ui/res/e$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/vector/d;", "f", "I", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f20264c = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final androidx.compose.ui.graphics.vector.d imageVector;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int configFlags;

        public a(@l androidx.compose.ui.graphics.vector.d dVar, int i4) {
            this.imageVector = dVar;
            this.configFlags = i4;
        }

        public static a d(a aVar, androidx.compose.ui.graphics.vector.d dVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                dVar = aVar.imageVector;
            }
            if ((i5 & 2) != 0) {
                i4 = aVar.configFlags;
            }
            aVar.getClass();
            return new a(dVar, i4);
        }

        @l
        /* renamed from: a, reason: from getter */
        public final androidx.compose.ui.graphics.vector.d getImageVector() {
            return this.imageVector;
        }

        /* renamed from: b, reason: from getter */
        public final int getConfigFlags() {
            return this.configFlags;
        }

        @l
        public final a c(@l androidx.compose.ui.graphics.vector.d imageVector, int configFlags) {
            return new a(imageVector, configFlags);
        }

        public final int e() {
            return this.configFlags;
        }

        public boolean equals(@m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return l0.g(this.imageVector, aVar.imageVector) && this.configFlags == aVar.configFlags;
        }

        @l
        public final androidx.compose.ui.graphics.vector.d f() {
            return this.imageVector;
        }

        public int hashCode() {
            return Integer.hashCode(this.configFlags) + (this.imageVector.hashCode() * 31);
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.imageVector);
            sb.append(", configFlags=");
            return androidx.view.e.a(sb, this.configFlags, ')');
        }
    }

    /* compiled from: VectorResources.android.kt */
    @u(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00060\u0002R\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/res/e$b;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "", "id", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "a", "()Landroid/content/res/Resources$Theme;", "b", "()I", "c", "(Landroid/content/res/Resources$Theme;I)Landroidx/compose/ui/res/e$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/res/Resources$Theme;", "f", "I", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f20267c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Resources.Theme theme;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int id;

        public b(@l Resources.Theme theme, int i4) {
            this.theme = theme;
            this.id = i4;
        }

        public static b d(b bVar, Resources.Theme theme, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                theme = bVar.theme;
            }
            if ((i5 & 2) != 0) {
                i4 = bVar.id;
            }
            bVar.getClass();
            return new b(theme, i4);
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Resources.Theme getTheme() {
            return this.theme;
        }

        /* renamed from: b, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @l
        public final b c(@l Resources.Theme theme, int id2) {
            return new b(theme, id2);
        }

        public final int e() {
            return this.id;
        }

        public boolean equals(@m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return l0.g(this.theme, bVar.theme) && this.id == bVar.id;
        }

        @l
        public final Resources.Theme f() {
            return this.theme;
        }

        public int hashCode() {
            return Integer.hashCode(this.id) + (this.theme.hashCode() * 31);
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.theme);
            sb.append(", id=");
            return androidx.view.e.a(sb, this.id, ')');
        }
    }

    public final void a() {
        this.map.clear();
    }

    @m
    public final a b(@l b key) {
        WeakReference<a> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int configChanges) {
        Iterator<Map.Entry<b, WeakReference<a>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(configChanges, aVar.e())) {
                it.remove();
            }
        }
    }

    public final void d(@l b key, @l a imageVectorEntry) {
        this.map.put(key, new WeakReference<>(imageVectorEntry));
    }
}
