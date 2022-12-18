(ns sqlite
  (:require [clojure.java.jdbc :as j]))

(defn create-db []
  (j/with-db-connection [conn {:dbtype "sqlite"
                               :dbname "test.db"}]
    (j/execute! conn ["CREATE TABLE IF NOT EXISTS test (id INTEGER PRIMARY KEY, name TEXT)"])))

;; FIXME: This is not working
(defn insert-data []
  (j/with-db-connection [conn {:dbtype "sqlite"
                               :dbname "test.db"}]
    (j/execute! conn ["INSERT INTO test (name) VALUES (?)"] ["test"])))

(defn select-data []
  (j/with-db-connection [conn {:dbtype "sqlite"
                               :dbname "test.db"}]
    (j/query conn ["SELECT * FROM test"])))

(create-db)
(insert-data)
(select-data)