package org.apache.commons.lang3.builder;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* compiled from: ReflectionDiffBuilder.java */
/* loaded from: classes6.dex */
public class o<T> implements a<e<T>> {

    /* renamed from: b, reason: collision with root package name */
    private final Object f85767b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f85768c;

    /* renamed from: d, reason: collision with root package name */
    private final d<T> f85769d;

    public o(T t4, T t5, t tVar) {
        this.f85767b = t4;
        this.f85768c = t5;
        this.f85769d = new d<>(t4, t5, tVar, true);
    }

    private boolean b(Field field) {
        if (field.getName().indexOf(36) == -1 && !Modifier.isTransient(field.getModifiers())) {
            return !Modifier.isStatic(field.getModifiers());
        }
        return false;
    }

    private void c(Class<?> cls) {
        for (Field field : org.apache.commons.lang3.reflect.b.a(cls)) {
            if (b(field)) {
                try {
                    this.f85769d.h(field.getName(), org.apache.commons.lang3.reflect.b.p(field, this.f85767b, true), org.apache.commons.lang3.reflect.b.p(field, this.f85768c, true));
                } catch (IllegalAccessException e4) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e4.getMessage());
                }
            }
        }
    }

    @Override // org.apache.commons.lang3.builder.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e<T> a() {
        if (this.f85767b.equals(this.f85768c)) {
            return this.f85769d.a();
        }
        c(this.f85767b.getClass());
        return this.f85769d.a();
    }
}
