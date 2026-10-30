import postgres from 'postgres';

let sql: ReturnType<typeof postgres> | null = null;

export function getSql(): ReturnType<typeof postgres> {
  const url = process.env.DATABASE_URL;
  if (!url) {
    throw new Error('DATABASE_URL is not set');
  }
  if (!sql) {
    // Defaults to require (Supabase/Vercel); set DATABASE_SSL=disable for local pg.
    const ssl = process.env.DATABASE_SSL === 'disable' ? false : 'require';
    sql = postgres(url, {
      ssl,
      max: 1,
      idle_timeout: 20,
      connect_timeout: 10,
    });
  }
  return sql;
}

export function dbConfigured(): boolean {
  return Boolean(process.env.DATABASE_URL?.trim());
}
