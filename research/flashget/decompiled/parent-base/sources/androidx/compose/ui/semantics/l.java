package androidx.compose.ui.semantics;

import androidx.compose.animation.d1;
import androidx.compose.ui.platform.d2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: SemanticsConfiguration.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R&\u0010/\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010.R\"\u00104\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00100\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103R\"\u00108\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00103¨\u00069"}, d2 = {"Landroidx/compose/ui/semantics/l;", "Landroidx/compose/ui/semantics/z;", "", "", "Landroidx/compose/ui/semantics/y;", "", "<init>", "()V", "T", "key", "j", "(Landroidx/compose/ui/semantics/y;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "l", "(Landroidx/compose/ui/semantics/y;Lld/a;)Ljava/lang/Object;", "m", "", "iterator", "()Ljava/util/Iterator;", "value", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/semantics/y;Ljava/lang/Object;)V", "", "f", "(Landroidx/compose/ui/semantics/y;)Z", "h", "()Z", "child", "r", "(Landroidx/compose/ui/semantics/l;)V", "peer", "c", "i", "()Landroidx/compose/ui/semantics/l;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Ljava/util/Map;", "props", "Z", "q", "v", "(Z)V", "isMergingSemanticsOfDescendants", "d", "p", "s", "isClearingSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nSemanticsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1747#2,3:200\n*S KotlinDebug\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n*L\n78#1:200,3\n*E\n"})
/* loaded from: classes.dex */
public final class l implements z, Iterable<Map.Entry<? extends y<?>, ? extends Object>>, md.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f20347e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<y<?>, Object> props = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isMergingSemanticsOfDescendants;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.z
    public <T> void b(@fg.l y<T> key, T value) {
        if (!(value instanceof a) || !this.props.containsKey(key)) {
            this.props.put(key, value);
            return;
        }
        Object obj = this.props.get(key);
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj;
        Map<y<?>, Object> map = this.props;
        a aVar2 = (a) value;
        String label = aVar2.getLabel();
        if (label == null) {
            label = aVar.getLabel();
        }
        kotlin.v a5 = aVar2.a();
        if (a5 == null) {
            a5 = aVar.a();
        }
        map.put(key, new a(label, a5));
    }

    public final void c(@fg.l l peer) {
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<y<?>, Object> entry : peer.props.entrySet()) {
            y<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof a) {
                Object obj = this.props.get(key);
                l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<y<?>, Object> map = this.props;
                String label = aVar.getLabel();
                if (label == null) {
                    label = ((a) value).getLabel();
                }
                kotlin.v a5 = aVar.a();
                if (a5 == null) {
                    a5 = ((a) value).a();
                }
                map.put(key, new a(label, a5));
            }
        }
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return l0.g(this.props, lVar.props) && this.isMergingSemanticsOfDescendants == lVar.isMergingSemanticsOfDescendants && this.isClearingSemantics == lVar.isClearingSemantics;
    }

    public final <T> boolean f(@fg.l y<T> key) {
        return this.props.containsKey(key);
    }

    public final boolean h() {
        Set<y<?>> keySet = this.props.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            if (((y) it.next()).getIsImportantForAccessibility()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isClearingSemantics) + d1.a(this.isMergingSemanticsOfDescendants, this.props.hashCode() * 31, 31);
    }

    @fg.l
    public final l i() {
        l lVar = new l();
        lVar.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        lVar.isClearingSemantics = this.isClearingSemantics;
        lVar.props.putAll(this.props);
        return lVar;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<Map.Entry<? extends y<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final <T> T j(@fg.l y<T> key) {
        T t4 = (T) this.props.get(key);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final <T> T l(@fg.l y<T> key, @fg.l ld.a<? extends T> defaultValue) {
        T t4 = (T) this.props.get(key);
        return t4 == null ? defaultValue.invoke() : t4;
    }

    @fg.m
    public final <T> T m(@fg.l y<T> key, @fg.l ld.a<? extends T> defaultValue) {
        T t4 = (T) this.props.get(key);
        return t4 == null ? defaultValue.invoke() : t4;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void r(@fg.l l child) {
        for (Map.Entry<y<?>, Object> entry : child.props.entrySet()) {
            y<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            l0.n(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object e4 = key.e(obj, value);
            if (e4 != null) {
                this.props.put(key, e4);
            }
        }
    }

    public final void s(boolean z4) {
        this.isClearingSemantics = z4;
    }

    @fg.l
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<y<?>, Object> entry : this.props.entrySet()) {
            y<?> key = entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(key.getName());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return d2.b(this, null) + "{ " + ((Object) sb) + " }";
    }

    public final void v(boolean z4) {
        this.isMergingSemanticsOfDescendants = z4;
    }
}
