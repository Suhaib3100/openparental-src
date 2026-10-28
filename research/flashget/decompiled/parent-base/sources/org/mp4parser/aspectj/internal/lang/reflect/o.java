package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;
import lg.a0;
import lg.y;

/* compiled from: PointcutImpl.java */
/* loaded from: classes9.dex */
public class o implements y {

    /* renamed from: a, reason: collision with root package name */
    private final String f87667a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f87668b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f87669c;

    /* renamed from: d, reason: collision with root package name */
    private final lg.d f87670d;

    /* renamed from: e, reason: collision with root package name */
    private String[] f87671e;

    protected o(String str, String str2, Method method, lg.d dVar, String str3) {
        this.f87671e = new String[0];
        this.f87667a = str;
        this.f87668b = new n(str2);
        this.f87669c = method;
        this.f87670d = dVar;
        this.f87671e = e(str3);
    }

    private String[] e(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            strArr[i4] = stringTokenizer.nextToken().trim();
        }
        return strArr;
    }

    @Override // lg.y
    public lg.d a() {
        return this.f87670d;
    }

    @Override // lg.y
    public String[] b() {
        return this.f87671e;
    }

    @Override // lg.y
    public lg.d<?>[] c() {
        Class<?>[] parameterTypes = this.f87669c.getParameterTypes();
        int length = parameterTypes.length;
        lg.d<?>[] dVarArr = new lg.d[length];
        for (int i4 = 0; i4 < length; i4++) {
            dVarArr[i4] = lg.e.a(parameterTypes[i4]);
        }
        return dVarArr;
    }

    @Override // lg.y
    public a0 d() {
        return this.f87668b;
    }

    @Override // lg.y
    public int getModifiers() {
        return this.f87669c.getModifiers();
    }

    @Override // lg.y
    public String getName() {
        return this.f87667a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getName());
        stringBuffer.append("(");
        lg.d<?>[] c5 = c();
        int i4 = 0;
        while (i4 < c5.length) {
            stringBuffer.append(c5[i4].getName());
            String[] strArr = this.f87671e;
            if (strArr != null && strArr[i4] != null) {
                stringBuffer.append(" ");
                stringBuffer.append(this.f87671e[i4]);
            }
            i4++;
            if (i4 < c5.length) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(") : ");
        stringBuffer.append(d().a());
        return stringBuffer.toString();
    }
}
