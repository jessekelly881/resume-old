(ns site.core
  (:require [goog.dom :as gdom]
            [reagent.dom :as dom]
            [stylefy.core :as stylefy :refer [use-style]]))

(def resume-link "https://github.com/jessekelly881/Resume/blob/master/pdf/resume.pdf")
(def github-link "https://github.com/jessekelly881")

(stylefy/init)

(defn page-divider []
  [:div.pageDivider])

(defn site-title [text]
  [:h1.siteTitle text])

(defn page [& children]
  [:section.page children])

(defn site-footer []
  [:footer.siteFooter
   [:span "Footer"]
   ])

(defn page-title [text]
  [:h2.pageTitle text])

(defn page-sub-title [text]
  [:h3.pageSubTitle text])

(defn top-page []
  [:section.topPage
     [site-title "Jesse Kelly"]
     [page-sub-title "I build things"]
  ])

(defn hire-me-page []
  [:section.hireMePage (use-style {:background-color "#F2AA8085" :height "45vh"})
    [page-title "Hire Me!!"]
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
    [:div.aboutMe
        [page-sub-title "About me"]
        [:p "I am a software engineer and creative. I love to make you dreams a readlity. Learn more about me! Check out "
            [:a {:href resume-link :target '_blank'} "My Resume"]
            " or "
            [:a {:href github-link :target '_blank'} "My Github Account"]
        ]
        [:p "I also love to travel and play the guitar! I am from the US origionally but live in Mexico City and am always planning backpacking trips."]
    ]

    [:div.supportMe
        [page-sub-title "Support my work!"]
     [:p "Got inspired? Copied the theme? Or do you just like the website? No problem, just buy me a beer!"
      [:br]
      "Bitcoin: "
      [:strong
       "bc1q60twsepwkjpf8w7myaupkr2fxkuc0cze0wxygh"
       ]
      ]
    ]
   ]

   [page-divider]

   [page
       [page-title "Education"]
   ]

   [page-divider]

   [page
       [page-title "Experience"]
   ]

   [page-divider]

   [page
       [page-title "Abilities"]
       [page-sub-title "Skills"]
       [page-sub-title "Languages"]
       [page-sub-title "Tools"]
   ]

   [page-divider]

   [page
       [page-title "Projects"]
   ]

   [hire-me-page]
   [footer]

   ]
  )

(dom/render [app] (gdom/getElement "app"))
