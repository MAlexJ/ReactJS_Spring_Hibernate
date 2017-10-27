import * as React from 'react';
import * as ReactDOM from 'react-dom';
import {Router, Route, IndexRoute} from 'react-router'
import {createHashHistory} from 'history';

import {IndexPage} from './components/pages/IndexPage';
import {FirstPage} from './components/pages/FirstPage';
import {SecondPage} from './components/pages/SecondPage';

import * as constants from './constants';

ReactDOM.render(

    <Router history={createHashHistory({queryKey: false})}>
        <Route path="/" component={IndexPage}>
            <IndexRoute component={FirstPage}/>
            <Route path="first" component={FirstPage}/>
            <Route path="second" component={SecondPage}/>
        </Route>
    </Router>,

    document.getElementById(constants.APP_CONTAINER_ID)
);
