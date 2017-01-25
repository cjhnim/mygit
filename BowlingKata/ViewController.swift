//
//  ViewController.swift
//  BowlingKata
//
//  Created by Choi Jung Hyun on 18/01/2017.
//  Copyright © 2017 Choi Jung Hyun. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    func isNumberEven(num: Int) -> Bool {
        
        if num%2 == 0 {
            return true
        } else {
            return false
        }
    }

}

