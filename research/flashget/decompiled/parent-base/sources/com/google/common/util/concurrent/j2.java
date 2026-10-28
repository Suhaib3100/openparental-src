package com.google.common.util.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: Uninterruptibles.java */
@b0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class j2 {
    private j2() {
    }

    @d9.c
    public static void a(ExecutorService executorService) {
        com.google.common.base.z0.a(b(executorService, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @d9.c
    public static boolean b(ExecutorService executorService, long j4, TimeUnit timeUnit) {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return executorService.awaitTermination(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @d9.c
    public static void c(CountDownLatch countDownLatch) {
        boolean z4 = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    @d9.c
    @f9.a
    public static boolean d(CountDownLatch countDownLatch, long j4, TimeUnit timeUnit) {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @d9.c
    public static boolean e(Condition condition, long j4, TimeUnit timeUnit) {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return condition.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @f9.a
    @j1
    public static <V> V f(Future<V> future) throws ExecutionException {
        V v4;
        boolean z4 = false;
        while (true) {
            try {
                v4 = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return v4;
    }

    @d9.c
    @f9.a
    @j1
    public static <V> V g(Future<V> future, long j4, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return future.get(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @d9.c
    public static void h(Thread thread) {
        boolean z4 = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    @d9.c
    public static void i(Thread thread, long j4, TimeUnit timeUnit) {
        thread.getClass();
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = nanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @d9.c
    public static <E> void j(BlockingQueue<E> blockingQueue, E e4) {
        boolean z4 = false;
        while (true) {
            try {
                blockingQueue.put(e4);
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    @d9.c
    public static void k(long j4, TimeUnit timeUnit) {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = nanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @d9.c
    public static <E> E l(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z4 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @d9.c
    public static boolean m(Semaphore semaphore, int i4, long j4, TimeUnit timeUnit) {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return semaphore.tryAcquire(i4, nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @d9.c
    public static boolean n(Semaphore semaphore, long j4, TimeUnit timeUnit) {
        return m(semaphore, 1, j4, timeUnit);
    }

    @d9.c
    public static boolean o(Lock lock, long j4, TimeUnit timeUnit) {
        boolean z4 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return lock.tryLock(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
