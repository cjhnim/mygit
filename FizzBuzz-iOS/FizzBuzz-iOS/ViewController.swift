//
//  ViewController.swift
//  FizzBuzz-iOS
//
//  Created by Choi Jung Hyun on 24/01/2017.
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

@IBOutlet weak var numberTextField: UITextField!
    @IBOutlet weak var resultLabel: UILabel!
    @IBAction func okButtonClick(_ sender: UIButton) {
//        resultLabel.text = "Fizz"
        
        let askme = FizzBuzzer()
        let number = Int(numberTextField.text!)
        let result = askme.isNumberFizzOrBuzz(number: number!)
        
        resultLabel.text = result
    }
}

