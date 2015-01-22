Vending Machine
==========

Pd. 1
Jason Shin, Shi Shu<br>
What our project does<br>
Our project is a vending machine. You can use it to kill time or procrastinate. The vending machine generates random items with random stocks, you can choose the amount that you pay and and you get the change back. At the end of the day, you can check to see how much money the vending machine made, and if it ever runs out of stocks for a certain item, you can replenish.
How to use our project<br>
1. Clicking on the items without inserting any money allows you to see check the price of an item, however, if you insert money and press the button, you will buy the item if you've inserted enough money. However, suppose you didn't insert enough, a message will pop up telling u how much more money you need and your money will stay in the machine.
2. The items all have stocks, and that means when you run out of a certain item, you cannot buy it anymore, until the stocks are replenished
3. The Replenish Stock button replenishes a random amount to the stocks from 0-15, this replenishes ALL the items' stocks
4. When you pay, you can choose to insert the amount of money you want to insert, just like normal vending machines, this vending machine accepts only quarters, dollar bills, and 5 dollar bills. There is also a cap of $9.75 for amount inserted, if you try to insert more, the machine simply wouldn't accept your money.
5. The labels and the textboxes should be self-explanatory with the labels, the long white textbox on the bottom is the message box.
Changelog
==========

  12/19/14 - Created repo - JS<br>
  12/21/14 - Decided on doing Vending Machine<br>
  12/22/14 - added Items, Items2, VM<br>
  1/5/15 - Finished initialization for the items, randomized items added to VM<br>
  1/6/15 - Added more items, added Machine.java (GUI)<br>
  1/7/15 - Continued working on Machine.java, added buttons<br>
  1/8/15 - Changed back to gridlayout from Spring layout<br>
  1/9/15 - Added JtextArea for price of the goods<br>
  1/12/15 - Added buttons to add money<br>
  1/13/15 - Finished Buttons to add money, and no more than $9.75 can be inserted<br>
  1/14/15 - Machine2 with timer attempt added<br>
  1/20/15 - Improved payment method, added textbox for change
  1/21/15 - Added profit to Machine
