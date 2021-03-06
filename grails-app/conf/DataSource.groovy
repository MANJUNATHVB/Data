dataSource {
 pooled = true
 driverClassName = "com.mysql.jdbc.Driver"
 dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
 cache.use_second_level_cache = true
 cache.use_query_cache = true
 cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
 development {
  dataSource {
   dbCreate = "update" // one of 'create', 'create-drop','update'
   url = "jdbc:mysql://localhost:3306/abcd"
   username = "root"
   password = "s9394767815"
  }
  hibernate {
   show_sql = true
  }
 }
 test {
  dataSource {
   dbCreate = "create" // one of 'create', 'create-drop','update'
   url = "jdbc:mysql://localhost:3306/abcd"
   username = "root"
   password = "s9394767815"
  }
 }
 production {
  dataSource {
   dbCreate = "update"
   url = "jdbc:mysql://localhost:3306/abcd"
   username = "root"
   password = "s9394767815"
  }
 }
}