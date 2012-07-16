(ns mass-todos.models.list
  [:require mass-todos.config :as config]
  (:use somnium.congomongo)
  (:use [somnium.congomongo.config :only [*mongo-config*]]))
