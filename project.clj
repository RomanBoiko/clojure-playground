(defproject vu-lmax "0.1.0-SNAPSHOT"
  :description "Playground"
  :dependencies [
    [org.clojure/clojure "1.5.1"]
    [com.taoensso/timbre "2.6.1"]]
  :dev-dependencies [
    [lein-eclipse "1.0.0"]]
  :main playground
  :aliases {"boot" ["run" "-m" "playground"]}
  :source-paths ["src"]
  :test-paths ["src"]
  :resource-paths ["src"])
