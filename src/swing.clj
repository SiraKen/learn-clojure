(ns swing
  (:import [javax.swing JFrame JButton]
           [java.awt.event ActionListener]))

(defn create-frame []
  (let [title "Hello, World"
        frame (JFrame. title)
        button (JButton. "Click Me")]
    (.setDefaultCloseOperation frame JFrame/EXIT_ON_CLOSE)
    (.addActionListener button
                        (reify ActionListener
                          (actionPerformed [_ e]
                            (println "Hello World"))))
    (.add frame button)
    (.pack frame)
    (.setResizable frame false)
    (.setSize frame 300 100)
    (.setVisible frame true)))

(create-frame)
