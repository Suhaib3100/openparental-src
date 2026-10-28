package h0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: AutofillTree.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.compose.ui.k
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lh0/a0;", "", "<init>", "()V", "Lh0/z;", "autofillNode", "Lkotlin/k2;", "c", "(Lh0/z;)V", "", "id", "", "value", "b", "(ILjava/lang/String;)Lkotlin/k2;", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f73915b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Integer, z> children = new LinkedHashMap();

    @fg.l
    public final Map<Integer, z> a() {
        return this.children;
    }

    @fg.m
    public final k2 b(int id2, @fg.l String value) {
        ld.l<String, k2> f4;
        z zVar = this.children.get(Integer.valueOf(id2));
        if (zVar == null || (f4 = zVar.f()) == null) {
            return null;
        }
        f4.invoke(value);
        return k2.f75408a;
    }

    public final void c(@fg.l z autofillNode) {
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
