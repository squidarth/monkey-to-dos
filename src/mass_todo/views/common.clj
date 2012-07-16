(ns mass-todo.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "mass-todo"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial layout/login [& content]
    (html5
      [:head
        [:title "Log in"]
        (include-css "/css/main.css")]
      [:body
        [:div#wrapper
          content]]))
