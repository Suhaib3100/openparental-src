package android.content.preferences.core;

import d5.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.f1;
import kotlin.jvm.internal.l0;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\n\u0006B\t\b\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\tH&J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u0000¨\u0006\u0010"}, d2 = {"Landroidx/datastore/preferences/core/d;", "", "T", "Landroidx/datastore/preferences/core/d$a;", "key", "", "b", "c", "(Landroidx/datastore/preferences/core/d$a;)Ljava/lang/Object;", "", "a", "Landroidx/datastore/preferences/core/a;", "d", "e", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/datastore/preferences/core/d$a;", "T", "", "value", "Landroidx/datastore/preferences/core/d$b;", "b", "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/d$b;", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String name;

        public a(@d5.d String name) {
            l0.p(name, "name");
            this.name = name;
        }

        @d5.d
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @d5.d
        public final b<T> b(T value) {
            return new b<>(this, value);
        }

        public boolean equals(@e Object other) {
            if (other instanceof a) {
                return l0.g(this.name, ((a) other).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @d5.d
        public String toString() {
            return this.name;
        }
    }

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/datastore/preferences/core/d$b;", "T", "", "Landroidx/datastore/preferences/core/d$a;", "a", "Landroidx/datastore/preferences/core/d$a;", "()Landroidx/datastore/preferences/core/d$a;", "key", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Landroidx/datastore/preferences/core/d$a;Ljava/lang/Object;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final a<T> key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public b(@d5.d a<T> key, T t5) {
            l0.p(key, "key");
            this.key = key;
            this.value = t5;
        }

        @d5.d
        public final a<T> a() {
            return this.key;
        }

        public final T b() {
            return this.value;
        }
    }

    @d5.d
    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(@d5.d a<T> key);

    @e
    public abstract <T> T c(@d5.d a<T> key);

    @d5.d
    public final android.content.preferences.core.a d() {
        Map J0;
        J0 = f1.J0(a());
        return new android.content.preferences.core.a(J0, false);
    }

    @d5.d
    public final d e() {
        Map J0;
        J0 = f1.J0(a());
        return new android.content.preferences.core.a(J0, true);
    }
}
