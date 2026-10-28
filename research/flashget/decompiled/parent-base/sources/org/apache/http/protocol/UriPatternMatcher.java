package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.util.Args;

@ThreadSafe
/* loaded from: classes3.dex */
public class UriPatternMatcher<T> {

    @GuardedBy("this")
    private final Map<String, T> map = new HashMap();

    @Deprecated
    public synchronized Map<String, T> getObjects() {
        return this.map;
    }

    public synchronized T lookup(String str) {
        T t4;
        try {
            Args.notNull(str, "Request path");
            t4 = this.map.get(str);
            if (t4 == null) {
                String str2 = null;
                for (String str3 : this.map.keySet()) {
                    if (matchUriRequestPattern(str3, str)) {
                        if (str2 != null) {
                            if (str2.length() >= str3.length()) {
                                if (str2.length() == str3.length() && str3.endsWith("*")) {
                                }
                            }
                        }
                        t4 = this.map.get(str3);
                        str2 = str3;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return t4;
    }

    protected boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals("*")) {
            return true;
        }
        if (str.endsWith("*") && str2.startsWith(str.substring(0, str.length() - 1))) {
            return true;
        }
        return str.startsWith("*") && str2.endsWith(str.substring(1, str.length()));
    }

    public synchronized void register(String str, T t4) {
        Args.notNull(str, "URI request pattern");
        this.map.put(str, t4);
    }

    @Deprecated
    public synchronized void setHandlers(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.map.clear();
        this.map.putAll(map);
    }

    @Deprecated
    public synchronized void setObjects(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.map.clear();
        this.map.putAll(map);
    }

    public String toString() {
        return this.map.toString();
    }

    public synchronized void unregister(String str) {
        if (str == null) {
            return;
        }
        this.map.remove(str);
    }
}
