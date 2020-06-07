/*
 * ************************************************************************
 *  Copyright (c) 2018 @alxgcrz <alxgcrz@outlook.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ***********************************************************************
 */

package patterns.creational.abstractfactory.example;

public class Game {

    public static void main(String[] args) {
        SoldierFactory factory = new ManFactory();

        Soldier manArcher = factory.makeArcher();
        Soldier manRider = factory.makeRider();

        System.out.println("Soldier 1: " + manArcher.name);
        System.out.println("Soldier 2: " + manRider.name);

        // Orcs
        factory = new OrcFactory();
        Soldier orcArcher = factory.makeArcher();
        Soldier orcRider = factory.makeRider();

        System.out.println("Soldier 3: " + orcArcher.name);
        System.out.println("Soldier 4: " + orcRider.name);
    }

}
