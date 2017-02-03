using System;

namespace FizzBuzzCSharp
{
    internal class FizzBuzzGame
    {
        internal static String Play(int number)
        {
            if (IsFizzBuzz(number))
            {
                return "FizzBuzz";
            }
            else if (IsBuzz(number))
            {
                return "Buzz";
            }
            else if (IsFizz(number))
            {
                return "Fizz";
            }
            else
            {
                return number.ToString();
            }
        }

        #region Private Methods
        private static bool IsBuzz(int number)
        {
            return (number % 5) == 0;
        }

        private static bool IsFizz(int number)
        {
            return (number % 3) == 0;
        }

        private static bool IsFizzBuzz(int number)
        {
            return (number % 15) == 0;
        }
        #endregion
    }
}