import * as React from 'react';
import {Router, Link} from 'react-router'

const ACTIVE_ITEM = 'navbar-item_active';

/**
 * `History` will be vailable only via mixins.
 * In order to use mixins I have no chise but fallback to React.createClass().
 * In ES6 mixins a deprecated: https://facebook.github.io/react/docs/reusable-components.html#no-mixins
 */
export const Navigation = React.createClass({

    getInitialState() {
        return {}
    },

    render() {
        return (
            <nav>
                <ul>
                    <li>
                        <Link to="/first" activeClassName={ACTIVE_ITEM}>First Page</Link>
                    </li>
                    <li>
                        <Link to="/second" activeClassName={ACTIVE_ITEM}>Second Page</Link>
                    </li>
                </ul>
            </nav>
        );
    }
});