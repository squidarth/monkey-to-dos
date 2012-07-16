(ns mass-todo.views.welcome
  (:require [mass-todo.views.common :as common]
            [mass-todo.helpers :as helpers] 
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to mass-todo"]))

(defpage "/login" []
         (common/login))

(defpage "/lists" []
         (common/lists))

(defpage "/auth/facebook" []
         (handleFacebookOauth []))

(defpage "/lists/add" {:as list}
  (layout
     (form-to [:post "/lists]
              (list-fields list))

(defpage [:post "/lists"] []
         (render "/lists"))

(defun handleFacebookOauth []
   ("john"))
