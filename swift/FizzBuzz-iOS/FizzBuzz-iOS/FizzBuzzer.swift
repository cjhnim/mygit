//
//  FizzBuzzer.swift
//  FizzBuzz-iOS
//
//  Created by Choi Jung Hyun on 24/01/2017.
//  Copyright © 2017 Choi Jung Hyun. All rights reserved.
//

import Foundation

class FizzBuzzer {
    init() {}
    
    func isNumberFizzOrBuzz(number: Int) -> String{
        
        if isFizzBuzz(number: number) {
            return "FizzBuzz"
        } else if isFizz(number: number) {
            return "Fizz"
        } else if isBuzz(number: number) {
            return "Buzz"
        } else {
            return String(number)
        }
    }
    
    func isFizz(number: Int) -> Bool {
        return 0 == number % 3
    }
    
    func isBuzz(number: Int) -> Bool {
        return 0 == number % 5
    }
    
    func isFizzBuzz(number: Int) -> Bool {
        return 0 == number % 15
    }
}
