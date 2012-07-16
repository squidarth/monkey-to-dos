(ns mass-todo.views.welcome
  (:require [mass-todo.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to mass-todo"]))

(defpage "/login" []
         (common/login
           [:p "Log in"]))

(server/start 8080)
