(ns site.core
  (:require [goog.dom :as gdom]
            [reagent.dom :as dom]
            [stylefy.core :as stylefy :refer [use-style]]))

(def top-page-style {:height "55vh"
                     :background-repeat "no-repeat"
                     :background-position "center bottom"
                     :background-color "#F2AA8085"
                     :background-image "url('http://seanhalpin.io/assets/img/content/home/masthead/land.svg')"})

(stylefy/init)

(defn site-title [text]
  [:h1.siteTitle text])

(defn page [& children]
  [:section children])

(defn site-footer []
  [:footer.siteFooter
   [:span "Footer"]
   ])

(defn page-title [text]
  [:h2.pageTitle text])

(defn page-sub-title [text]
  [:h3.pageSubTitle text])

(defn top-page []
  [:section (use-style top-page-style)
     [site-title "Jesse Kelly"]
  ])

(defn hire-me-page []
  [:section (use-style {:background-color "#F2AA8085" :height "45vh"})
   [page
    [page-title "Hire Me!"]
    ]
   ])

(defn footer []
  [:section (use-style {:margin-top "20px" :text-align "center"})
   [:small "Built using Clojurescript!"]]
  )

(defn app []
  [:div
   [:title "Jesse Kelly"]
   [top-page]
   [page
       [page-title "Profile"]
   ]

   [page
       [page-title "Education"]
   ]

   [page
       [page-title "Experience"]
   ]

   [page
       [page-title "Abilities"]
       [page-sub-title "Skills"]
       [page-sub-title "Languages"]
       [page-sub-title "Tools"]
   ]

   [page
       [page-title "Projects"]
   ]

   [hire-me-page]
   [footer]

   ]
  )

(dom/render [app] (gdom/getElement "app"))
