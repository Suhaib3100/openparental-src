package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* compiled from: InterTypeFieldDeclarationImpl.java */
/* loaded from: classes9.dex */
public class j extends i implements lg.r {

    /* renamed from: e, reason: collision with root package name */
    private String f87652e;

    /* renamed from: f, reason: collision with root package name */
    private lg.d<?> f87653f;

    /* renamed from: g, reason: collision with root package name */
    private Type f87654g;

    public j(lg.d<?> dVar, String str, int i4, String str2, lg.d<?> dVar2, Type type) {
        super(dVar, str, i4);
        this.f87652e = str2;
        this.f87653f = dVar2;
        this.f87654g = type;
    }

    @Override // lg.r
    public Type b() {
        return this.f87654g;
    }

    @Override // lg.r
    public String getName() {
        return this.f87652e;
    }

    @Override // lg.r
    public lg.d<?> getType() {
        return this.f87653f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(getModifiers()));
        stringBuffer.append(" ");
        stringBuffer.append(getType().toString());
        stringBuffer.append(" ");
        stringBuffer.append(this.f87649b);
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    public j(lg.d<?> dVar, lg.d<?> dVar2, Field field) {
        super(dVar, dVar2, field.getModifiers());
        this.f87652e = field.getName();
        this.f87653f = lg.e.a(field.getType());
        Type genericType = field.getGenericType();
        if (genericType instanceof Class) {
            this.f87654g = lg.e.a((Class) genericType);
        } else {
            this.f87654g = genericType;
        }
    }
}
