package androidx.content.preferences.core;

import fg.l;
import fg.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\r\bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/datastore/preferences/core/d;", "", "<init>", "()V", "T", "Landroidx/datastore/preferences/core/d$a;", "key", "", "b", "(Landroidx/datastore/preferences/core/d$a;)Z", "c", "(Landroidx/datastore/preferences/core/d$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "Landroidx/datastore/preferences/core/a;", "d", "()Landroidx/datastore/preferences/core/a;", "e", "()Landroidx/datastore/preferences/core/d;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/datastore/preferences/core/d$a;", "T", "", "", "name", "<init>", "(Ljava/lang/String;)V", "value", "Landroidx/datastore/preferences/core/d$b;", "b", "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/d$b;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String name;

        public a(@l String name) {
            l0.p(name, "name");
            this.name = name;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        public final b<T> b(T value) {
            return new b<>(this, value);
        }

        public boolean equals(@m Object other) {
            if (other instanceof a) {
                return l0.g(this.name, ((a) other).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @l
        public String toString() {
            return this.name;
        }
    }

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/datastore/preferences/core/d$b;", "T", "", "Landroidx/datastore/preferences/core/d$a;", "key", "value", "<init>", "(Landroidx/datastore/preferences/core/d$a;Ljava/lang/Object;)V", "a", "Landroidx/datastore/preferences/core/d$a;", "()Landroidx/datastore/preferences/core/d$a;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final a<T> key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public b(@l a<T> key, T t4) {
            l0.p(key, "key");
            this.key = key;
            this.value = t4;
        }

        @l
        public final a<T> a() {
            return this.key;
        }

        public final T b() {
            return this.value;
        }
    }

    @l
    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(@l a<T> key);

    @m
    public abstract <T> T c(@l a<T> key);

    @l
    public final androidx.content.preferences.core.a d() {
        return new androidx.content.preferences.core.a(z0.J0(a()), false);
    }

    @l
    public final d e() {
        return new androidx.content.preferences.core.a(z0.J0(a()), true);
    }
}
