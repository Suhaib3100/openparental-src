package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.e;

/* loaded from: classes6.dex */
public class ContextedRuntimeException extends RuntimeException implements c {

    /* renamed from: c, reason: collision with root package name */
    private static final long f85987c = 20110706;

    /* renamed from: b, reason: collision with root package name */
    private final c f85988b;

    public ContextedRuntimeException() {
        this.f85988b = new b();
    }

    @Override // org.apache.commons.lang3.exception.c
    public Set<String> a() {
        return this.f85988b.a();
    }

    @Override // org.apache.commons.lang3.exception.c
    public List<e<String, Object>> b() {
        return this.f85988b.b();
    }

    @Override // org.apache.commons.lang3.exception.c
    public String c(String str) {
        return this.f85988b.c(str);
    }

    @Override // org.apache.commons.lang3.exception.c
    public Object d(String str) {
        return this.f85988b.d(str);
    }

    @Override // org.apache.commons.lang3.exception.c
    public List<Object> f(String str) {
        return this.f85988b.f(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return c(super.getMessage());
    }

    @Override // org.apache.commons.lang3.exception.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContextedRuntimeException e(String str, Object obj) {
        this.f85988b.e(str, obj);
        return this;
    }

    public String i() {
        return super.getMessage();
    }

    @Override // org.apache.commons.lang3.exception.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ContextedRuntimeException g(String str, Object obj) {
        this.f85988b.g(str, obj);
        return this;
    }

    public ContextedRuntimeException(String str) {
        super(str);
        this.f85988b = new b();
    }

    public ContextedRuntimeException(Throwable th) {
        super(th);
        this.f85988b = new b();
    }

    public ContextedRuntimeException(String str, Throwable th) {
        super(str, th);
        this.f85988b = new b();
    }

    public ContextedRuntimeException(String str, Throwable th, c cVar) {
        super(str, th);
        this.f85988b = cVar == null ? new b() : cVar;
    }
}
