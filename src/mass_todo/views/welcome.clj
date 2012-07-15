(ns mass-todo.views.welcome
  (:require [mass-todo.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]])
  (:use somnium.congomongo)
  (:use [:somnium.congomongo.config :only [*mongo-config*]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to mass-todo"]))

(defpage "/login" []
         (common/layout/login
           [:p "Log in"]))
