package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.e;

/* loaded from: classes6.dex */
public class ContextedException extends Exception implements c {

    /* renamed from: c, reason: collision with root package name */
    private static final long f85985c = 20110706;

    /* renamed from: b, reason: collision with root package name */
    private final c f85986b;

    public ContextedException() {
        this.f85986b = new b();
    }

    @Override // org.apache.commons.lang3.exception.c
    public Set<String> a() {
        return this.f85986b.a();
    }

    @Override // org.apache.commons.lang3.exception.c
    public List<e<String, Object>> b() {
        return this.f85986b.b();
    }

    @Override // org.apache.commons.lang3.exception.c
    public String c(String str) {
        return this.f85986b.c(str);
    }

    @Override // org.apache.commons.lang3.exception.c
    public Object d(String str) {
        return this.f85986b.d(str);
    }

    @Override // org.apache.commons.lang3.exception.c
    public List<Object> f(String str) {
        return this.f85986b.f(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return c(super.getMessage());
    }

    @Override // org.apache.commons.lang3.exception.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ContextedException e(String str, Object obj) {
        this.f85986b.e(str, obj);
        return this;
    }

    public String i() {
        return super.getMessage();
    }

    @Override // org.apache.commons.lang3.exception.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ContextedException g(String str, Object obj) {
        this.f85986b.g(str, obj);
        return this;
    }

    public ContextedException(String str) {
        super(str);
        this.f85986b = new b();
    }

    public ContextedException(Throwable th) {
        super(th);
        this.f85986b = new b();
    }

    public ContextedException(String str, Throwable th) {
        super(str, th);
        this.f85986b = new b();
    }

    public ContextedException(String str, Throwable th, c cVar) {
        super(str, th);
        this.f85986b = cVar == null ? new b() : cVar;
    }
}
