package org.apache.http.config;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
/* loaded from: classes3.dex */
public final class RegistryBuilder<I> {
    private final Map<String, I> items = new HashMap();

    RegistryBuilder() {
    }

    public static <I> RegistryBuilder<I> create() {
        return new RegistryBuilder<>();
    }

    public Registry<I> build() {
        return new Registry<>(this.items);
    }

    public RegistryBuilder<I> register(String str, I i4) {
        Args.notEmpty(str, "ID");
        Args.notNull(i4, "Item");
        this.items.put(str.toLowerCase(Locale.US), i4);
        return this;
    }

    public String toString() {
        return this.items.toString();
    }
}
